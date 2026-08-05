package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.class)
public class EnvironmentAttributeMap729963061Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Entry;", cancellable = true)
    private void get__341065282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341065282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2115474824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115474824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__405497410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405497410L))
            info.setReturnValue("Tl\u105D6!0\u86C5g#x\u7380P\uAEE4eT\u86F9!&x\"/I1/#T\uD3E2/\"R[4)dw{,A:LERN)h-\u968A\"\uA6C1ixk\u17CB(\u5319f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_768225307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768225307L))
            info.setReturnValue(-2043025109);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private static void builder__1476499381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476499381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Z", cancellable = true)
    private void contains__492737138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492737138L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__1099072425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099072425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyModifier(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyModifier_576468178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576468178L))
            info.setReturnValue(new java.lang.Object());
    }


}
