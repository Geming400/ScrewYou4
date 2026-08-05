package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.AllOfCondition.Builder.class)
public class Builder398672194Mixin {
        @Inject(at = @At("HEAD"), method = "and(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/AllOfCondition$Builder;", cancellable = true)
    private void and_1435091271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435091271L))
            info.setReturnValue(null);
    }


}
