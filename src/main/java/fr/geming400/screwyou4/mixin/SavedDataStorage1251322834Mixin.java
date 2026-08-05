package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.SavedDataStorage.class)
public class SavedDataStorage1251322834Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/saveddata/SavedDataType;)Lnet/minecraft/world/level/saveddata/SavedData;", cancellable = true)
    private void get_1179400805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179400805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/saveddata/SavedDataType;Lnet/minecraft/world/level/saveddata/SavedData;)V", cancellable = true)
    private void set__440246433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-440246433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeIfAbsent(Lnet/minecraft/world/level/saveddata/SavedDataType;)Lnet/minecraft/world/level/saveddata/SavedData;", cancellable = true)
    private void computeIfAbsent_1179400805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179400805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1289597573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289597573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAndJoin()V", cancellable = true)
    private void saveAndJoin_1289597573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289597573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleSave()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void scheduleSave__1330269201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330269201L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "readTagFromDisk(Ljava/nio/file/Path;Lnet/minecraft/util/datafix/DataFixTypes;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void readTagFromDisk_231406806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231406806L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
