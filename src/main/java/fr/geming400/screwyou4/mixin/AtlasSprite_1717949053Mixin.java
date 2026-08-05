package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.AtlasSprite.class)
public class AtlasSprite_1717949053Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1191505985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191505985L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_582489077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582489077L))
            info.setReturnValue("(< \u3848\u8560_v^\uB05A\uB421#\u80D5&84V$_\uC02C[k,xA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1756211794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756211794L))
            info.setReturnValue(1825293850);
    }

    @Inject(at = @At("HEAD"), method = "spriteId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void spriteId__725117501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725117501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasId__725117501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725117501L))
            info.setReturnValue(null);
    }


}
