package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.StorageValue.class)
public class StorageValue666910676Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2052422935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052422935L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__468549299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468549299L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_705173418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705173418L))
            info.setReturnValue(1813450003);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt__1710054759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710054759L))
            info.setReturnValue(1416535058);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__1710057642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710057642L))
            info.setReturnValue(1.664371E8F);
    }

    @Inject(at = @At("HEAD"), method = "path()Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private void path__639798581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639798581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storage()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void storage__1776155877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776155877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1892202896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892202896L))
            info.setReturnValue(null);
    }


}
