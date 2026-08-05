package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.BlockItemTagId.class)
public class BlockItemTagId235241693Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1620753952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620753952L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__900218282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900218282L))
            info.setReturnValue("CGHp#<Bg\u5F99CL:(& \uC98AlX[\"\uFB85t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_273504435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273504435L))
            info.setReturnValue(-1118883947);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__1943083534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943083534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__2050410122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050410122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/tags/BlockItemTagId;", cancellable = true)
    private static void create__1871925652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871925652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void block_1082575738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082575738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void item_1082575738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082575738L))
            info.setReturnValue(null);
    }


}
