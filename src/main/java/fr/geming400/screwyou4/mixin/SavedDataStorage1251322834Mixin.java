package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.SavedDataStorage.class)
public class SavedDataStorage1251322834Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/saveddata/SavedDataType;)Lnet/minecraft/world/level/saveddata/SavedData;", cancellable = true)
    private void get__1843664581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843664581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/saveddata/SavedDataType;Lnet/minecraft/world/level/saveddata/SavedData;)V", cancellable = true)
    private void set_889284797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889284797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeIfAbsent(Lnet/minecraft/world/level/saveddata/SavedDataType;)Lnet/minecraft/world/level/saveddata/SavedData;", cancellable = true)
    private void computeIfAbsent__875005774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875005774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__863252595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-863252595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleSave()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void scheduleSave__711124317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711124317L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "saveAndJoin()V", cancellable = true)
    private void saveAndJoin__1827534431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827534431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readTagFromDisk(Ljava/nio/file/Path;Lnet/minecraft/util/datafix/DataFixTypes;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void readTagFromDisk__1422466165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1422466165L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
