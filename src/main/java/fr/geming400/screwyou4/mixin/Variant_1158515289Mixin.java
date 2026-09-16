package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Variant.class)
public class Variant_1158515289Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void values__1470996816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470996816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void valueOf_1237424759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237424759L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.WHITE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__499808307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499808307L))
            info.setReturnValue(2086090580);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Variant;", cancellable = true)
    private static void byId_2061370030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061370030L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1246723910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246723910L))
            info.setReturnValue("f#Wu)v}U_l<i2R\u669CW\u49D2UnDZExSd'<\u3759\u3C3Dt[mjTN>##?\u68A7i1V^NmQ#");
    }


}
