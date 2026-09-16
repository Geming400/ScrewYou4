package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.BlockStateDefinitions.class)
public class BlockStateDefinitions1169570062Mixin {
        @Inject(at = @At("HEAD"), method = "definitionLocationToBlockStateMapper()Ljava/util/function/Function;", cancellable = true)
    private static void definitionLocationToBlockStateMapper_1050584691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050584691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemFrameFakeState(ZZ)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getItemFrameFakeState__1677611028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677611028L))
            info.setReturnValue(null);
    }


}
