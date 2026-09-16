package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootParams.class)
public class LootParams_370941674Mixin {
        @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_249837063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249837063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextMap()Lnet/minecraft/util/context/ContextMap;", cancellable = true)
    private void contextMap__1095436870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095436870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLuck()F", cancellable = true)
    private void getLuck_1245259205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245259205L))
            info.setReturnValue(5.96384E7F);
    }

    @Inject(at = @At("HEAD"), method = "addDynamicDrops(Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDynamicDrops__664225564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-664225564L))
            info.cancel();
    }


}
