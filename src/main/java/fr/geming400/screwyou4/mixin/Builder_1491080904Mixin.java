package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.Builder.class)
public class Builder_1491080904Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private void create__885285226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885285226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel__2136348393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136348393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalRandomSeed(J)Lnet/minecraft/world/level/storage/loot/LootContext$Builder;", cancellable = true)
    private void withOptionalRandomSeed__164637004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164637004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalRandomSource(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/storage/loot/LootContext$Builder;", cancellable = true)
    private void withOptionalRandomSource__1765371570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765371570L))
            info.setReturnValue(null);
    }


}
