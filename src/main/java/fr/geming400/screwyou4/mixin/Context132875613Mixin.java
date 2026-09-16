package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.Context.class)
public class Context132875613Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__775750655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775750655L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_903299138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903299138L))
            info.setReturnValue("hDC&@BR^X,\uC0CE@9C)\u48F9jzNN :q\uCA9A<'R4F@s/V7zVLEes\uCC7Dllqg+{}$MY1-s\u9002sI`\u9348R:g\u5F5A(7h00clg\u6A9Ef(I\u1F9CO7$3@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_690227704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690227704L))
            info.setReturnValue(-1051841019);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of_577086169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577086169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of_2016920993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016920993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/gameevent/GameEvent$Context;", cancellable = true)
    private static void of__1520961336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520961336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void sourceEntity__196104379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196104379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectedState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void affectedState__1913753592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913753592L))
            info.setReturnValue(null);
    }


}
