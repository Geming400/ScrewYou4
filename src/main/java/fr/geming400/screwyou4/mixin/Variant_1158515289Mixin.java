package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Variant.class)
public class Variant_1158515289Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void values__1697801710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697801710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void valueOf_476217167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476217167L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.DARK_BROWN);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1196777534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196777534L))
            info.setReturnValue(1230808112);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void byId_1220985536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220985536L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_23054817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23054817L))
            info.setReturnValue("Q");
    }


}
