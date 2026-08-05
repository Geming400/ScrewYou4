package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LeavesFix.class)
public class LeavesFix1975706283Mixin {
        @Inject(at = @At("HEAD"), method = "getIndex(III)I", cancellable = true)
    private static void getIndex_1195601634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195601634L))
            info.setReturnValue(-1206653919);
    }

    @Inject(at = @At("HEAD"), method = "getSideMask(ZZZZ)I", cancellable = true)
    private static void getSideMask_1563126793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563126793L))
            info.setReturnValue(1295880283);
    }


}
