package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.BlockStateDefinitions.class)
public class BlockStateDefinitions1169570062Mixin {
        @Inject(at = @At("HEAD"), method = "getItemFrameFakeState(ZZ)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getItemFrameFakeState__1906220876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906220876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definitionLocationToBlockStateMapper()Ljava/util/function/Function;", cancellable = true)
    private static void definitionLocationToBlockStateMapper__756602437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756602437L))
            info.setReturnValue(null);
    }


}
