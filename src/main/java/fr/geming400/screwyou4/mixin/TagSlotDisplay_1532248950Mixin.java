package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.TagSlotDisplay.class)
public class TagSlotDisplay_1532248950Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__2047882822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047882822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1377206088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377206088L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_396788974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396788974L))
            info.setReturnValue("Do6Ꮹ珲dl#VAɽ\"s뛨0aZ]ஐzP/>p_n#2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1570511691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570511691L))
            info.setReturnValue(304538459);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__49866739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49866739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void tag__1915384302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915384302L))
            info.setReturnValue(null);
    }


}
