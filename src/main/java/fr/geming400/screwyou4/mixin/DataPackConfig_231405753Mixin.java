package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.DataPackConfig.class)
public class DataPackConfig_231405753Mixin {
        @Inject(at = @At("HEAD"), method = "getDisabled()Ljava/util/List;", cancellable = true)
    private void getDisabled__42864166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42864166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnabled()Ljava/util/List;", cancellable = true)
    private void getEnabled_939571827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939571827L))
            info.setReturnValue(null);
    }


}
