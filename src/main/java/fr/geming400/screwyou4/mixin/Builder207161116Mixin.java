package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FilteredFunction.Builder.class)
public class Builder207161116Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__2083247980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083247980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPass(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private void onPass__133508690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133508690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFail(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private void onFail__809483391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809483391L))
            info.setReturnValue(null);
    }


}
