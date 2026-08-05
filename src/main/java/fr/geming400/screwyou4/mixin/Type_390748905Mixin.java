package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.class)
public class Type_390748905Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private static void values__1505233547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505233547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private static void valueOf_358027772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358027772L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.HIDDEN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_478957526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478957526L))
            info.setReturnValue("\u3D29\u01E2P/n\u3226T%7OWQG*[}X3zu1\u307A\u5AEDP^mI3PB#d\u1D64Gfqz{\u57E2svb/%/h-g%T*EHC`S*{.C9xif4UsB$]\u63ABv");
    }


}
