package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.Builder.class)
public class Builder_1491080904Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private void create__1116355182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116355182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1369976293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369976293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalRandomSeed(J)Lnet/minecraft/world/level/storage/loot/LootContext$Builder;", cancellable = true)
    private void withOptionalRandomSeed_1007728954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007728954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptionalRandomSource(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/storage/loot/LootContext$Builder;", cancellable = true)
    private void withOptionalRandomSource__2027645526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027645526L))
            info.setReturnValue(null);
    }


}
