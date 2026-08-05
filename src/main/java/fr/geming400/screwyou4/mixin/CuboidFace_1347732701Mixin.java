package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidFace.class)
public class CuboidFace_1347732701Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1561722337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561722337L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_212272725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212272725L))
            info.setReturnValue("{=uvCvsh*⏢U仛k3]vz[6Aᅰ晿?ꢃR_潮A栞{i(S9%/o`ሐ@s\",dZRIKⰁ.pZ珧w[6EY>Q\"Lo)]|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1385995442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385995442L))
            info.setReturnValue(1936782252);
    }

    @Inject(at = @At("HEAD"), method = "getU(Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;Lcom/mojang/math/Quadrant;I)F", cancellable = true)
    private static void getU__1143248768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143248768L))
            info.setReturnValue(2.06402E8F);
    }

    @Inject(at = @At("HEAD"), method = "uvs()Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;", cancellable = true)
    private void uvs__826325584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826325584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintIndex()I", cancellable = true)
    private void tintIndex_1385994946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385994946L))
            info.setReturnValue(2115305742);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void rotation__1272364938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272364938L))
            info.setReturnValue(com.mojang.math.Quadrant.R0);
    }

    @Inject(at = @At("HEAD"), method = "cullForDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void cullForDirection_584877415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584877415L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "texture()Ljava/lang/String;", cancellable = true)
    private void texture_212272229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212272229L))
            info.setReturnValue("!o\"వᦾq\"db=ﾉ");
    }

    @Inject(at = @At("HEAD"), method = "getV(Lnet/minecraft/client/resources/model/cuboid/CuboidFace$UVs;Lcom/mojang/math/Quadrant;I)F", cancellable = true)
    private static void getV__1143248768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143248768L))
            info.setReturnValue(2.06402E8F);
    }


}
