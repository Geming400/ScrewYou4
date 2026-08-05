package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.class)
public class JointType1048987193Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void values_666987701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666987701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void valueOf_258598076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258598076L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ALIGNED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1137195815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137195815L))
            info.setReturnValue("g\uD5F7-lm(I_Yk@\uD693Rt9e]\uCDF8gJ_Flw/ir\u4989?]e7Y[\u5B45,tPk@(7V@Tx`/i=B");
    }

    @Inject(at = @At("HEAD"), method = "getTranslatedName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslatedName_631643011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631643011L))
            info.setReturnValue(null);
    }


}
