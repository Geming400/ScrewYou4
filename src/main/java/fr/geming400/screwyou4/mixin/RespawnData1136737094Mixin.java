package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelData.RespawnData.class)
public class RespawnData1136737094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1772717943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772717943L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1277119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277119L))
            info.setReturnValue("eFGqw/#}\u3E61B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1174999836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174999836L))
            info.setReturnValue(1847128553);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;FF)Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private static void of_459674054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459674054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__756649785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756649785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pitch()F", cancellable = true)
    private void pitch_1174996457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174996457L))
            info.setReturnValue(9.781236E8F);
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_1174996457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174996457L))
            info.setReturnValue(9.781236E8F);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1945228407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945228407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalPos()Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private void globalPos__1329115553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329115553L))
            info.setReturnValue(null);
    }


}
