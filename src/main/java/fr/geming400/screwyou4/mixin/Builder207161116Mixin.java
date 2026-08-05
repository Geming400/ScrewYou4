package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.FilteredFunction.Builder.class)
public class Builder207161116Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__506399038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506399038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPass(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private void onPass__1026999746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026999746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFail(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/FilteredFunction$Builder;", cancellable = true)
    private void onFail__1026999746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026999746L))
            info.setReturnValue(null);
    }


}
