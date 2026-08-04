package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.TrappedChestBlockEntityFix.TrappedChestSection.class)
public class TrappedChestSection_1847867488Mixin {
        @Inject(at = @At("HEAD"), method = "isTrappedChest(I)Z", cancellable = true)
    private void isTrappedChest__1233178993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233178993L))
            info.setReturnValue(null);
    }


}
