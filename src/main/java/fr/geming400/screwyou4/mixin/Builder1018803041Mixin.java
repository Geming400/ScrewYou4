package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder.class)
public class Builder1018803041Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1271606055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271606055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/storage/loot/functions/ListOperation;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void setMode_870085831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870085831L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addLine(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void addLine_847809140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847809140L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setResolutionContext(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void setResolutionContext__1077684285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077684285L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder());
    }


}
