package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContextArg.ArgCodecBuilder.class)
public class ArgCodecBuilder142500262Mixin {
        @Inject(at = @At("HEAD"), method = "anyOf([Lnet/minecraft/util/StringRepresentable;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf_421055567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421055567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Lnet/minecraft/util/StringRepresentable;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf_331390675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331390675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Ljava/lang/Object;Ljava/util/function/Function;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf_1225450196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225450196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyEntity(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyEntity_1090867829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090867829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyItemStack(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyItemStack_1090867829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090867829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyBlockEntity(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyBlockEntity_1090867829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090867829L))
            info.setReturnValue(null);
    }


}
