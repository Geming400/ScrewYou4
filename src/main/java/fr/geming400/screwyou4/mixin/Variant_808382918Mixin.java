package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.Variant.class)
public class Variant_808382918Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void values_34942224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34942224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void valueOf__1289949325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289949325L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_846645163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846645163L))
            info.setReturnValue(-665735700);
    }

    @Inject(at = @At("HEAD"), method = "byBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void byBiome__785004552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785004552L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.RED);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void byId_323033634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323033634L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__327077554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327077554L))
            info.setReturnValue("4M!\u04B5\u7088iH\u4918\u95EEF7Z\uAB842KJ\u03F6a\u1F13\u77ED");
    }


}
