package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContextArg.ArgCodecBuilder.class)
public class ArgCodecBuilder142500262Mixin {
        @Inject(at = @At("HEAD"), method = "anyOf([Lnet/minecraft/util/StringRepresentable;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf_702960050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702960050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Lnet/minecraft/util/StringRepresentable;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf_1778620496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778620496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Ljava/lang/Object;Ljava/util/function/Function;Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyOf__2111786313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111786313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyEntity(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyEntity_396535908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396535908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyItemStack(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyItemStack_1934772254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934772254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyBlockEntity(Ljava/util/function/Function;)Lnet/minecraft/world/level/storage/loot/LootContextArg$ArgCodecBuilder;", cancellable = true)
    private void anyBlockEntity_1872025529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872025529L))
            info.setReturnValue(null);
    }


}
