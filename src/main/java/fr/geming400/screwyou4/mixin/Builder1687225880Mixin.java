package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition.Builder.class)
public class Builder1687225880Mixin {
        @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/LootItemBlockStatePropertyCondition$Builder;", cancellable = true)
    private void setProperties__913775233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913775233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build__1551854710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551854710L))
            info.setReturnValue(null);
    }


}
