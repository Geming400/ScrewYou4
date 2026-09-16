package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LeavesFix.class)
public class LeavesFix1975706283Mixin {
        @Inject(at = @At("HEAD"), method = "getIndex(III)I", cancellable = true)
    private static void getIndex_823747070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823747070L))
            info.setReturnValue(1160085068);
    }

    @Inject(at = @At("HEAD"), method = "getSideMask(ZZZZ)I", cancellable = true)
    private static void getSideMask_1289743824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289743824L))
            info.setReturnValue(1860508147);
    }


}
