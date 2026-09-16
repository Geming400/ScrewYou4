package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.RemoveBinomial.class)
public class RemoveBinomial2113606261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1204979993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204979993L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1410937510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410937510L))
            info.setReturnValue("Y.(Bw\u4339@]sD!p9L*l.PP\uC418i\u3F0F`1K|!!Ll&@[z&CYf\u6C5D Us,q&\u99B96>\u4645rsY\u25E4o4I0]x#$)#JEGR'8uz6\uACE5YYG3[0LD5#\u3B061\"d!+R!v#Nt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1624008944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624008944L))
            info.setReturnValue(-1267012371);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process_237597462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237597462L))
            info.setReturnValue(7.029462E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1114915781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114915781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chance()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void chance__1928242024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928242024L))
            info.setReturnValue(null);
    }


}
