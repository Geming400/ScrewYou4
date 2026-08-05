package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LeavesFix.LeavesSection.class)
public class LeavesSection_1555479384Mixin {
        @Inject(at = @At("HEAD"), method = "isLeaf(I)Z", cancellable = true)
    private void isLeaf_612749103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612749103L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLog(I)Z", cancellable = true)
    private void isLog__881716287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881716287L))
            info.setReturnValue(false);
    }


}
