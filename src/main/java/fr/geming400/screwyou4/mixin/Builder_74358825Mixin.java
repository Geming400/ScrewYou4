package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootTable.Builder.class)
public class Builder_74358825Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void apply__339089689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339089689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction$Builder;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void apply__1500307826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500307826L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void unwrap__659019312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659019312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lnet/minecraft/world/level/storage/loot/functions/FunctionUserBuilder;", cancellable = true)
    private void unwrap_763240233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763240233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/LootTable;", cancellable = true)
    private void build__431994361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431994361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPool(Lnet/minecraft/world/level/storage/loot/LootPool$Builder;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void withPool_1865314219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865314219L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setParamSet(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void setParamSet__988791014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988791014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRandomSequence(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private void setRandomSequence__593537464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593537464L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }


}
