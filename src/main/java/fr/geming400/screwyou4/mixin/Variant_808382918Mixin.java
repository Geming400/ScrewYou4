package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.Variant.class)
public class Variant_808382918Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void values__1524040654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524040654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void valueOf_832649547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832649547L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__849940678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849940678L))
            info.setReturnValue(1875631114);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void byId_605149172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605149172L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.RED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_896591539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896591539L))
            info.setReturnValue("8(nI\u3970C@Gq\u573AXb\"e\uAFEAm8l\u1624;1Bo3CE{\uCCDA(ZaAQ4aH");
    }

    @Inject(at = @At("HEAD"), method = "byBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private static void byBiome_206527041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206527041L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.RED);
    }


}
