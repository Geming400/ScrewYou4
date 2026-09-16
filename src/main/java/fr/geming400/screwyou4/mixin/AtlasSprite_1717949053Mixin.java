package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.AtlasSprite.class)
public class AtlasSprite_1717949053Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_809322784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809322784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1806594719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806594719L))
            info.setReturnValue("pZb\u58A5#g{22 t\u6B8BdQZ\uA0748-('_KH<\uC8563p\u6C1E8@;A3M+_!@8=JSnE+3gCh\u1C30@\"n5hCJ'm\"u@\u86FElRskYXL#<9vs\u2376T+GH0X t\u1242(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2019666153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019666153L))
            info.setReturnValue(1432374581);
    }

    @Inject(at = @At("HEAD"), method = "spriteId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void spriteId_63521923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63521923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasId__2139885879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139885879L))
            info.setReturnValue(null);
    }


}
