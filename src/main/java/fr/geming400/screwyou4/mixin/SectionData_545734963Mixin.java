package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SerializableChunkData.SectionData.class)
public class SectionData_545734963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__362891306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362891306L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1316158487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316158487L))
            info.setReturnValue("XWymOfp\u1A09WD\uD453xWBhV\u662FS10Nh\u30C2yB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1103087053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103087053L))
            info.setReturnValue(-1117459801);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y__246842817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246842817L))
            info.setReturnValue(1583093325);
    }

    @Inject(at = @At("HEAD"), method = "skyLight()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void skyLight_1547688312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547688312L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "blockLight()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void blockLight_309543652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309543652L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "chunkSection()Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void chunkSection__1044124384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044124384L))
            info.setReturnValue(null);
    }


}
