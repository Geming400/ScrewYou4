package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootParams.class)
public class LootParams_370941674Mixin {
        @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1038479673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038479673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextMap()Lnet/minecraft/util/context/ContextMap;", cancellable = true)
    private void contextMap__293276409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293276409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDynamicDrops(Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDynamicDrops__1595954242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1595954242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLuck()F", cancellable = true)
    private void getLuck_409201036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409201036L))
            info.setReturnValue(7.592174E8F);
    }


}
