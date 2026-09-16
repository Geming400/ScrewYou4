package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.FileFixStats.class)
public class FileFixStats_1808025707Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_78588718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78588718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "totalOperations()I", cancellable = true)
    private void totalOperations__459553280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459553280L))
            info.setReturnValue(-970790210);
    }

    @Inject(at = @At("HEAD"), method = "finishedOperations()I", cancellable = true)
    private void finishedOperations_1290346258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290346258L))
            info.setReturnValue(-790019537);
    }

    @Inject(at = @At("HEAD"), method = "getProgress()F", cancellable = true)
    private void getProgress_1418355018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418355018L))
            info.setReturnValue(5.703978E8F);
    }


}
