package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ImpossibleTrigger.TriggerInstance.class)
public class TriggerInstance2035513846Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__873941191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873941191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_900053871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900053871L))
            info.setReturnValue("M%l3@TO vIN^cKC:6>gtWꄄ%jDapA;>,xxM?^H*).憾LcIನI먱amYQ㿗ME$hT<%W弒'蛛(;_lS⨑挵/S6z牅AyoULM䆱o,e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2073776588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073776588L))
            info.setReturnValue(730226827);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__104426882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-104426882L))
            info.cancel();
    }


}
