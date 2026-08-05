package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetLoreFunction.Builder.class)
public class Builder1018803041Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_305242887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305242887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/storage/loot/functions/ListOperation;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void setMode__152059806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152059806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setResolutionContext(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void setResolutionContext__1242751740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242751740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLine(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/level/storage/loot/functions/SetLoreFunction$Builder;", cancellable = true)
    private void addLine_1438486207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438486207L))
            info.setReturnValue(null);
    }


}
