package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.FileFixStats.class)
public class FileFixStats_1808025707Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1846300445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1846300445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress()F", cancellable = true)
    private void getProgress_1846285069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846285069L))
            info.setReturnValue(4.398965E8F);
    }

    @Inject(at = @At("HEAD"), method = "finishedOperations()I", cancellable = true)
    private void finishedOperations_1846287952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846287952L))
            info.setReturnValue(963212992);
    }

    @Inject(at = @At("HEAD"), method = "totalOperations()I", cancellable = true)
    private void totalOperations_1846287952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846287952L))
            info.setReturnValue(963212992);
    }


}
