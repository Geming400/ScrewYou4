package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.AbstractScrollArea.ScrollbarSettings.class)
public class ScrollbarSettings1505224627Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1404230410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404230410L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_369764652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369764652L))
            info.setReturnValue("c%Mp R\"C|KTfqN`!5#戔{뷆FB?Vꃾk\"}|7\"m^cU⟭xr{i瞉>UV&sL,ᗳh^MN,_YOOFg+UV⒫+{5s`vJ旸c歨嬿}꾏5(dO)R,G0M@Z?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1543487369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543487369L))
            info.setReturnValue(839466076);
    }

    @Inject(at = @At("HEAD"), method = "backgroundSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void backgroundSprite__937841926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937841926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disabledScrollerSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabledScrollerSprite__937841926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937841926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scrollerSprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void scrollerSprite__937841926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937841926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scrollbarWidth()I", cancellable = true)
    private void scrollbarWidth_1543486873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543486873L))
            info.setReturnValue(1042613495);
    }

    @Inject(at = @At("HEAD"), method = "scrollbarMinHeight()I", cancellable = true)
    private void scrollbarMinHeight_1543486873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543486873L))
            info.setReturnValue(1042613495);
    }

    @Inject(at = @At("HEAD"), method = "resizingScrollbar()Z", cancellable = true)
    private void resizingScrollbar_1543503210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543503210L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "scrollRate()I", cancellable = true)
    private void scrollRate_1543486873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543486873L))
            info.setReturnValue(1042613495);
    }


}
