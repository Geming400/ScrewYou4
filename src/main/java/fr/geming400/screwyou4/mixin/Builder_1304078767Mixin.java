package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.EntityHasScoreCondition.Builder.class)
public class Builder_1304078767Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build__1935001824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935001824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScore(Ljava/lang/String;Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/predicates/EntityHasScoreCondition$Builder;", cancellable = true)
    private void withScore_867074571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867074571L))
            info.setReturnValue(null);
    }


}
