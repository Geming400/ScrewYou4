package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LeavesFix.LeavesSection.class)
public class LeavesSection_1555479384Mixin {
        @Inject(at = @At("HEAD"), method = "isLeaf(I)Z", cancellable = true)
    private void isLeaf__1525567097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525567097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLog(I)Z", cancellable = true)
    private void isLog__1525567097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525567097L))
            info.setReturnValue(null);
    }


}
