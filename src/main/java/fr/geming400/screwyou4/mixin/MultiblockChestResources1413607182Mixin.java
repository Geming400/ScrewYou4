package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.MultiblockChestResources.class)
public class MultiblockChestResources1413607182Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1495847855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495847855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_278147207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278147207L))
            info.setReturnValue("@\u3556{oCXdSvFR4$!'\u4BA2$56T;\u516E-v|?*C^b\u9BEF\uB8B8uYwO\"PyzQ]`9r2X{qj\uC3AA^_y\uD68D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1451869924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451869924L))
            info.setReturnValue(687759881);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/MultiblockChestResources;", cancellable = true)
    private void map__1089614656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089614656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "single()Ljava/lang/Object;", cancellable = true)
    private void single__1022167895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022167895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/lang/Object;", cancellable = true)
    private void left__1022167895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022167895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/lang/Object;", cancellable = true)
    private void right__1022167895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022167895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/world/level/block/state/properties/ChestType;)Ljava/lang/Object;", cancellable = true)
    private void select_1606808277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606808277L))
            info.setReturnValue(null);
    }


}
