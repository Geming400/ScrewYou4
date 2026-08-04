package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockEntityFurnaceBurnTimeFix.class)
public class BlockEntityFurnaceBurnTimeFix_2071171453Mixin {
        @Inject(at = @At("HEAD"), method = "fixBurnTime(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixBurnTime__316678213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316678213L))
            info.setReturnValue(null);
    }


}
