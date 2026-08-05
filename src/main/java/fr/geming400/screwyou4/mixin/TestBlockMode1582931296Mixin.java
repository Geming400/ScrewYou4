package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.TestBlockMode.class)
public class TestBlockMode1582931296Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private static void values_501950175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501950175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private static void valueOf_2082912870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082912870L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.TestBlockMode.LOG);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1531623830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531623830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1671139918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671139918L))
            info.setReturnValue("XT<E'I4(Q>v`gHQ85twrF4#H @>U!F@{DJ\u3C9Fr!X28\u3C34K\u5687I\u27C3_\u1E89 ^4y\u8297}-kg\u9AEEd \u0555\uB335\uB7DDRBo&\uBA0F\u9A2D68g\uBB5D!");
    }

    @Inject(at = @At("HEAD"), method = "getDetailedMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDetailedMessage_1460124596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460124596L))
            info.setReturnValue(null);
    }


}
