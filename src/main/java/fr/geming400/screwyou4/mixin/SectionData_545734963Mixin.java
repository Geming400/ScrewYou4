package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SerializableChunkData.SectionData.class)
public class SectionData_545734963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1931247221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931247221L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__589725013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589725013L))
            info.setReturnValue("E>E+J\u2FF0m%]oY{mla`?\u17BBbe(`g*S(\"ID,\".>B$ORdL\u757A*I\uC805>5\u8C28plF;\u5145|@\uA68E\u26B8y\uC4EFJZ@ywfdSIWv\u5CA9DKG\uCDBFEw<N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_583997704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583997704L))
            info.setReturnValue(1023300768);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_583997208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583997208L))
            info.setReturnValue(-349483308);
    }

    @Inject(at = @At("HEAD"), method = "blockLight()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void blockLight__1781861747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781861747L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "skyLight()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void skyLight__1781861747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781861747L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "chunkSection()Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void chunkSection__617673768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617673768L))
            info.setReturnValue(null);
    }


}
