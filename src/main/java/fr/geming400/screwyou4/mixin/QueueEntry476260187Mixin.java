package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LightEngine.QueueEntry.class)
public class QueueEntry476260187Mixin {
        @Inject(at = @At("HEAD"), method = "increaseSkySourceInDirections(ZZZZZ)J", cancellable = true)
    private static void increaseSkySourceInDirections__271748809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271748809L))
            info.setReturnValue(2784539863055221070L);
    }

    @Inject(at = @At("HEAD"), method = "shouldPropagateInDirection(JLnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void shouldPropagateInDirection_675121108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675121108L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "increaseSkipOneDirection(IZLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void increaseSkipOneDirection_989214205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989214205L))
            info.setReturnValue(-327599217190571486L);
    }

    @Inject(at = @At("HEAD"), method = "increaseOnlyOneDirection(IZLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void increaseOnlyOneDirection__651333776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651333776L))
            info.setReturnValue(5282646853924113786L);
    }

    @Inject(at = @At("HEAD"), method = "increaseLightFromEmission(IZ)J", cancellable = true)
    private static void increaseLightFromEmission_30074790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30074790L))
            info.setReturnValue(-105032019567265702L);
    }

    @Inject(at = @At("HEAD"), method = "decreaseSkipOneDirection(ILnet/minecraft/core/Direction;)J", cancellable = true)
    private static void decreaseSkipOneDirection__2129442987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129442987L))
            info.setReturnValue(4857618520257363639L);
    }

    @Inject(at = @At("HEAD"), method = "decreaseAllDirections(I)J", cancellable = true)
    private static void decreaseAllDirections_424330890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424330890L))
            info.setReturnValue(-718629534683008866L);
    }

    @Inject(at = @At("HEAD"), method = "isFromEmptyShape(J)Z", cancellable = true)
    private static void isFromEmptyShape_1399789932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399789932L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFromLevel(J)I", cancellable = true)
    private static void getFromLevel__1775062409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775062409L))
            info.setReturnValue(-1714318443);
    }

    @Inject(at = @At("HEAD"), method = "isIncreaseFromEmission(J)Z", cancellable = true)
    private static void isIncreaseFromEmission_1325282113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325282113L))
            info.setReturnValue(false);
    }


}
