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
            info.setReturnValue("=R0i!K㪍U=m魯$]媘C uIg(DY`6퐅߾<i9r|Ger닫?ᱤzy{Lr-ꀭVfbDA:>vȰ3r5=@?!B/SRwYy锬4≏j<텫YF<k?:hAg-]ꝵ0'KXy*G2uZ_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1779885124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779885124L))
            info.setReturnValue(-493207633);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_606161911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606161911L))
            info.setReturnValue("=R0i!K㪍U=m魯$]媘C uIg(DY`6퐅߾<i9r|Ger닫?ᱤzy{Lr-ꀭVfbDA:>vȰ3r5=@?!B/SRwYy锬4≏j<텫YF<k?:hAg-]ꝵ0'KXy*G2uZ_");
    }

    @Inject(at = @At("HEAD"), method = "argCount()I", cancellable = true)
    private void argCount_1779884628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779884628L))
            info.setReturnValue(-290060213);
    }


}
