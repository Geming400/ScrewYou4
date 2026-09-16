package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.BrigadierExceptions.class)
public class BrigadierExceptions_1736515237Mixin {
        @Inject(at = @At("HEAD"), method = "longTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void longTooLow__657853269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657853269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherParseException()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void dispatcherParseException__351763494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351763494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedFloat()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedFloat__1016322255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016322255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedBool()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedBool_1355134677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355134677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidFloat()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidFloat__21871915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21871915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedSymbol()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerExpectedSymbol_937602346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937602346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherUnknownCommand()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherUnknownCommand_360750808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360750808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherUnknownArgument()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherUnknownArgument__779451344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779451344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedDouble()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedDouble_1316445436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316445436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatcherExpectedArgumentSeparator()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void dispatcherExpectedArgumentSeparator__225246055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225246055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void doubleTooHigh__1659840652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659840652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidInt()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidInt__1542865758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542865758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedInt()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedInt_1057180164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057180164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidLong()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidLong_866455181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866455181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedLong()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedLong_2116334183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116334183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidDouble()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidDouble_1516875992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516875992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidEscape()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidEscape__67976664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67976664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void floatTooLow__286363509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286363509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "integerTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void integerTooLow_405257581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405257581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "integerTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void integerTooHigh__1777695577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777695577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void longTooHigh__374393559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374393559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "literalIncorrect()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void literalIncorrect__1304330265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304330265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedStartOfQuote()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedStartOfQuote_1183488270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183488270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerExpectedEndOfQuote()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;", cancellable = true)
    private void readerExpectedEndOfQuote_485926197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485926197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerInvalidBool()Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;", cancellable = true)
    private void readerInvalidBool__1255893025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255893025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTooLow()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void doubleTooLow__422224640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422224640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatTooHigh()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType;", cancellable = true)
    private void floatTooHigh__1743112887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743112887L))
            info.setReturnValue(null);
    }


}
