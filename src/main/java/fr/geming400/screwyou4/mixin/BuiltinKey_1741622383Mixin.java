package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtOperations.BuiltinKey.class)
public class BuiltinKey_1741622383Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1167832655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167832655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_606161911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606161911L))
            info.setReturnValue("=R0i!K\u3A8DU=m\uF939$]\u5A98C uIg(DY`6\uD405\u07FE<i9r|Ger\uB2EB?\u1C64zy{Lr-\uA02DVfbDA:>v\u02303r5=@?!B/SRwYy\u952C4\u224Fj<\uD16BYF<k?:hAg-]\uA7750'KXy*G2uZ_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1779885124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779885124L))
            info.setReturnValue(172734867);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_606161911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606161911L))
            info.setReturnValue("=R0i!K\u3A8DU=m\uF939$]\u5A98C uIg(DY`6\uD405\u07FE<i9r|Ger\uB2EB?\u1C64zy{Lr-\uA02DVfbDA:>v\u02303r5=@?!B/SRwYy\u952C4\u224Fj<\uD16BYF<k?:hAg-]\uA7750'KXy*G2uZ_");
    }

    @Inject(at = @At("HEAD"), method = "argCount()I", cancellable = true)
    private void argCount_1779884628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779884628L))
            info.setReturnValue(375882287);
    }


}
