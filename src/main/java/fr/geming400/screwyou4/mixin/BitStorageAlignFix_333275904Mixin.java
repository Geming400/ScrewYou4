package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BitStorageAlignFix.class)
public class BitStorageAlignFix_333275904Mixin {
        @Inject(at = @At("HEAD"), method = "addPadding(II[J)[J", cancellable = true)
    private static void addPadding_1681978790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681978790L))
            info.setReturnValue(null);
    }


}
