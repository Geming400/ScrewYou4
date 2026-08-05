package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.AnyFuel.class)
public class AnyFuel1519736412Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1724947419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724947419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2004807855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004807855L))
            info.setReturnValue("%a^XD]/P2|Z^([rG\u6D4CQUj'9&u.i]\u52BC\u3270{\u102E\u9C52%O>nd\u4F85@u\uD6B0@_|L)\uB695oZ*j3qlCF>QtPLI3#?DIkE3]\u532C^Lq_\u1CA0\uD115Q]'a*4T*\u8BFFbJjh|=X");
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__976237600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976237600L))
            info.setReturnValue(null);
    }


}
