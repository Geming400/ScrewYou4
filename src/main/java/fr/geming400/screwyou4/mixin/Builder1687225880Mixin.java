package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition.Builder.class)
public class Builder1687225880Mixin {
        @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemBlockStatePropertyCondition$Builder;", cancellable = true)
    private void setProperties__1328728108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328728108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build_1971490360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971490360L))
            info.setReturnValue(null);
    }


}
